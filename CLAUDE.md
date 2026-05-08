# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

Spring Boot 2.7.18 web service on Java 11, built with Maven. The whole app is two files under `src/main/java/com/example/hello/`:

- `HelloApplication` — `@SpringBootApplication` entry point.
- `HelloController` — `@RestController` mounted at `/api`, exposing `GET /api/hello`. The `name` query param is normalized (first char uppercased, rest lowercased) before being interpolated into the response; missing or empty `name` falls back to `World`.

There is no test source tree yet (`src/test/...` does not exist), no `application.properties`, and the only declared dependency is `spring-boot-starter-web`. The server runs on the Spring Boot default port `8080`.

## Commands

- Run locally: `mvn spring-boot:run` — serves on `http://localhost:8080`.
- Build jar: `mvn package` — produces `target/hello-api-0.0.1-SNAPSHOT.jar` (executable via `java -jar`).
- Run tests: `mvn test`. Single test once tests exist: `mvn -Dtest=ClassName#methodName test`.
- Smoke check: `curl 'http://localhost:8080/api/hello?name=alice'` → `Hello Alice, how are you`.
