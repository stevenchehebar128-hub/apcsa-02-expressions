# Exercise 4 — Predict, Then Run

**Fill in the PREDICTED column completely before you run any code.** That's the whole exercise. Checking the answer without committing to a guess teaches you nothing.

| # | Expression | Predicted | Actual | Right? | If wrong, why? |
|---|---|---|---|---|---|
| 1 | `9 / 2` | 5 | 4 | no | Because Its not a double and i thought it would round up |
| 2 | `9 % 2` | 1 | 1 | yes | |
| 3 | `9.0 / 2` | 4.5 | 4.5 | yes | |
| 4 | `9 / 2.0` | 4.5 | 4.5 | yes | |
| 5 | `2 + 3 * 4` | 14 | 14 | yes | |
| 6 | `(2 + 3) * 4` | 20 | 20 | yes | |
| 7 | `20 - 5 - 3` | 12 | 12 | yes | |
| 8 | `17 % 5` | 2 | 2 | yes | |
| 9 | `5 % 17` | 5 | 5 | yes | |
| 10 | `100 / 3 / 3` | 11 | 11 | yes | |
| 11 | `1 / 2 * 100` | 50| 0 | no | since it divides first it goes to 0 then 0 x 100|
| 12 | `100 * 1 / 2` | | | | |

---

## Follow-up

**1. Compare #11 and #12. Same numbers, same operators, completely different answers. Explain why.**

[your answer]

**2. #9 gives `5`. Explain why `5 % 17` is 5 and not 0.**

[your answer]

**3. A classmate writes this to calculate a percentage:**
```java
int correct = 7;
int total = 10;
double percent = correct / total * 100;
```
**They get `0.0`. Explain what went wrong and write the corrected line.**

[your answer]

```java
// corrected line:
```

**4. Give one real situation where `%` would genuinely be useful. Not from this worksheet — something from your own life or your project idea.**

[your answer]
