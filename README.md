# CISC/CMPE 422/835: Formal Methods in Software Engineering
## RIPR model, line and branch coverage, and property-based testing with Jqwik

Sample code to illustrate Reachability-Infection-Propagation-Reveal (RIPR) model, 
structural coverage metrics (line and branch coverage), and property-based testing with Jqwik. 
See CISC 422/835 course notes for details.

### `FindLast`
The [`findLast(int[] a, int e)`](src/main/java/FindLast.java#L6-L12) method has a bug, but 4 of the 5 tests in 
[`FindLastExampleTests.java`](src/test/java/FindLastExampleTests.java) succeed anyway, because they don't satisfy
the requirements of the RIPR model. Only test [`test5`](src/test/java/FindLastExampleTests.java#L29-L33) 
results in an assertion violation and causes the execution to fail.
Example taken from Oscar Luis Vera-Pérez's [Software Validation & Verification course](https://oscarlvp.github.io/vandv-classes).
[`FindLastProperties.java`](src/test/java/FindLastProperties.java) shows how property-based testing can be used to 
automatically find test inputs that lead to a test failure.

### `MaxInt2`, `MaxInt4`, and `MaxPos`
[`maxInt2(int x1, int x2)`](src/main/java/MaxInt2.java#L6-L11) and 
[`maxInt4(int x1, int x2, int x3, int x4)`](src/main/java/MaxInt4.java#L6-L33) 
illustrate line and branch coverage. 
Tests in [`maxInt4ExampleTests.java`](src/test/java/MaxInt4ExampleTests.java) show how poor coverage
can lead to an ineffective test suite. 
[`maxPos(int[] a)`](src/main/java/MaxPos.java) shows how example-based testing does not work well
whenever there is more than one correct result. 
[`MaxProperties.java`](src/test/java/MaxProperties.java) shows how these issues can be addressed with 
property-based testing. 







