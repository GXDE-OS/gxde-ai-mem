# gxde-ai-mem

## Code style

Java sources follow the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html),
enforced by two Gradle plugins:

- **Spotless** (`com.diffplug.spotless`) formats with `google-java-format`
  (2-space indent, 100-column limit) and removes unused imports.
- **Checkstyle** validates against the official `google_checks.xml`, vendored at
  `config/checkstyle/checkstyle.xml` (pinned to checkstyle 14.4.0).

Both run as part of `check`:

```bash
./gradlew spotlessApply   # reformat sources in place
./gradlew check           # spotlessCheck + checkstyleMain + tests
```

Public types and public/protected methods need Javadoc (`MissingJavadocType` /
`MissingJavadocMethod`); test methods annotated with `@Test` are exempt. Any
Checkstyle warning fails the build (`maxWarnings = 0`). Reports land in
`build/reports/checkstyle/main.html`.

In IntelliJ IDEA, set *Settings → Editor → Code Style → Scheme* to
**Google Style** (a `.editorconfig` with 2-space indent and 100-column limit is
also provided).
