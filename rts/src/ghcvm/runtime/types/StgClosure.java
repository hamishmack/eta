package ghcvm.runtime.types;

public interface StgClosure {
    ClosureType closureType = ClosureType.InvalidObject;
    void enter();

    public enum ClosureType {
        InvalidObject,
        Constr,
        Constr10,
        Constr01,
        Constr20,
        Constr11,
        Constr02,
        ConstrStatic,
        ConstrNoCAFStatic,
        Fun,
        Fun10,
        Fun01,
        Fun20,
        Fun11,
        Fun02,
        FunStatic,
        Thunk,
        Thunk10,
        Thunk01,
        Thunk20,
        Thunk11,
        Thunk02,
        ThunkStatic,
        ThunkSelector,
        BCO,
        AP,
        PAP,
        APStack,
        Ind,
        IndPerm,
        IndStatic,
        RetBCO,
        RetSmall,
        RetBig,
        RetFun,
        UpdateFrame,
        CatchFrame,
        UnderflowFrame,
        StopFrame,
        BlockingQueue,
        Blackhole,
        MVarClean,
        MVarDirty,
        TVar,
        ArrWords,
        MutArrPtrsClean,
        MutArrPtrsDirty,
        MutArrPtrsFrozen0,
        MutArrPtrsFrozen,
        MutVarClean,
        MutVarDirty,
        Weak,
        Prim,
        MutPrim,
        TSO,
        Stack,
        TRecChunk,
        AtomicallyFrame,
        CatchRetryFrame,
        CatchSTMFrame,
        Whitehole,
        SmallMutArrPtrsClean,
        SmallMutArrPtrsDirty,
        SmallMutArrPtrsFrozen0,
        SmallMutArrPtrsFrozen
    }
}
