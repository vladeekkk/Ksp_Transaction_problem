# Ksp_Transaction_problem

I use runInTransaction method in TransactionDatabase class to do many opetations with many daos (myFirstDao; mySecondDao) in one transacion

this `runIntransaction` method has the same signature as the same method of `RoomDatabase` class, and kapt sees that.

The example of the bug is in `MainActivity`, where i somehow get an object of type `DatabaseWithDaos`

This works perfectly fine in `KAPT`, however `KSP` is not fine with it:
```
e: [ksp] Dao class must be annotated with @Dao - kotlin.Unit
e: [ksp] Dao class must be an abstract class or an interface - kotlin.Unit
```
