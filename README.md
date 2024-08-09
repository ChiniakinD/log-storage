## Модуль , который принимает сообщения из kafka, и затем сохраняет в базу данных.

## Запуск проекта с использованием Docker
1. Создать контейнер PostgreSQL:
```bash
docker run --name logstorage -e POSTGRES_PASSWORD=postgres -p 5435:5432 -d postgres
```

2. Запустить контейнер PostgreSQL:
```bash
docker start logstorage
```