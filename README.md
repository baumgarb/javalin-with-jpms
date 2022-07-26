# Getting started on local dev machine

```shell
# 1. Clone repository
git clone https://github.com/baumgarb/javalin-with-jpms.git

# 2. Go into project root directory
cd ./javalin-with-jpms

# 3.1 - Windows
.\gradlew.bat :api:run

# 3.2 - Linux
./gradlew :api:run

# 4. Open another terminal and hit the API
curl -i http://localhost:7312/persons
```
