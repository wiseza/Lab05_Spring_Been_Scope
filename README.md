Assignment: My First REST API — "Coffee Menu Service"
> รายวิชา: CP353002 — Principles of Software Design and Development
> ประเภท: Mini Project (ทำเดี่ยว หรือกลุ่ม 2 คน)
> เทคโนโลยี: Java 17+, Spring Boot 3.x, Maven หรือ Gradle
> เก็บข้อมูล: ใน memory (List ธรรมดา) — ยังไม่ต้องใช้ฐานข้อมูล สิ่งที่ต้องส่ง: Source code (สร้าง repo เอง ไม่ต้อง fork) + รายงานผลทดสอบสั้น ๆ

## วิธีรันโปรแกรม

เปิด Terminal ภายในโฟลเดอร์โปรเจกต์ แล้วรันคำสั่ง

```bash
./mvnw spring-boot:run
```

# ตัวอย่างการเรียก API ด้วย Postman

Base URL

```
http://localhost:8080
```

---

## 1. ดูเมนูทั้งหมด

- **Method:** GET
- **URL:**

```
http://localhost:8080/coffees
```

กด **Send**

---

## 2. ดูเมนูตาม ID

- **Method:** GET
- **URL:**

```
http://localhost:8080/coffees/1
```

กด **Send**

---

## 3. เพิ่มเมนูใหม่

- **Method:** POST
- **URL:**

```
http://localhost:8080/coffees
```

เลือก

```
Body
→ raw
→ JSON
```

ใส่ข้อมูล

```json
{
    "name": "Cappuccino",
    "price": 60
}
```

กด **Send**

---

## 4. แก้ไขข้อมูล

- **Method:** PUT
- **URL:**

```
http://localhost:8080/coffees/2
```

เลือก

```
Body
→ raw
→ JSON
```

ใส่ข้อมูล

```json
{
    "name": "Latte",
    "price": 50
}
```

กด **Send**

---

## 5. ลบข้อมูล

- **Method:** DELETE
- **URL:**

```
http://localhost:8080/coffees/3
```

กด **Send**
