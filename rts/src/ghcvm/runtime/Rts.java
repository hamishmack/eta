package ghcvm.runtime;

#include "Rts.h"

import ghcvm.runtime.types.*;
import static ghcvm.runtime.RtsScheduler.*;
import static ghcvm.runtime.StgClosures.*;

public class Rts {
    public static Capability lock() {return null;}
    public static void unlock(Capability cap) {}
    public static void evalLazyIO(Ptr<Capability> cap, CLOSURE_PTR p, REF_CLOSURE_PTR ret) {
        // TODO: Java has a hard-to-get stack size. How do we deal with that?
        StgTSO tso = createIOThread(cap.ref, p);
        scheduleWaitThread(tso, ret, cap);
    }
    public static SchedulerStatus getSchedStatus(Capability cap) {return null;}
    public static StgTSO createIOThread(Capability cap, CLOSURE_PTR p) {
        StgTSO t = new StgTSO(cap);
        t.pushClosure(stg_ap_v);
        t.pushClosure(p);
        t.pushClosure(stg_enter);
        return t;
    }
}
