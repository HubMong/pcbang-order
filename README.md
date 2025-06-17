# 🍜 PC방 푸드 주문 및 포인트 적립 시스템

## 📌 프로젝트 개요

이 프로젝트는 **PC방 이용 고객**을 대상으로, 음식 주문 기능과 **포인트 적립/사용 시스템**을 제공하는 웹 애플리케이션입니다.  
고객은 주문 금액에 따라 포인트를 자동으로 적립받으며, 적립된 포인트는 이벤트 참여, 할인 쿠폰 교환 또는 결제 시 할인에 사용할 수 있습니다.

## 🛠 사용 기술 스택

- **Frontend**: HTML5, CSS3, JavaScript
- **Backend**: Java (Spring Boot), JSP/Servlet (STS4)
- **Database**: MySQL
- **Build & Server**: Apache Tomcat 9, Maven
- **IDE**: Eclipse (Spring Tool Suite 4)


## ✅ 주요 기능

- 🛒 메뉴 선택 및 장바구니 담기
- 💳 결제 수단 선택 (현금, 카드, 카카오페이)
- ⭐ 포인트 적립 (주문 금액 기준 자동 적립)
- 🔁 포인트 사용 (결제 시 할인 적용)
- 🎁 포인트로 이벤트/쿠폰 교환 기능
- 🧾 주문 내역 및 포인트 내역 조회
- 🔐 로그인/회원가입 및 세션 처리


## 🗃️ 데이터베이스 구조 (ERD 요약)

| 테이블명 | 설명 |
|----------|------|
| `users` | 사용자 정보 (아이디, 이름, 비밀번호, 보유포인트 등) |
| `menu` | 음식 메뉴 정보 (id, 이름, 가격, 이미지 등) |
| `orders` | 주문 정보 (id, user_id, 총금액, 주문시간 등) |
| `order_items` | 주문 상세 항목 (order_id, menu_id, 수량 등) |
| `point_history` | 포인트 내역 (id, user_id, 적립/사용, 금액, 내용, 날짜) |
| `coupon` | 교환 가능한 쿠폰 정보 (id, 이름, 필요 포인트 등) |


## 🧠 포인트 적립/사용 로직

### ✅ 적립 로직
- 주문 완료 시 총 금액의 **5%를 포인트로 적립**
- 예: 10,000원 주문 → 500포인트 적립

### ✅ 사용 로직
- 장바구니 결제 시 보유 포인트 입력 가능
- 사용 가능한 최대 포인트는 전체 금액 이하로 제한
- 포인트 사용 시 `point_history`에 "사용" 기록 남김


## 🚀 실행 방법

```bash
# 1. 프로젝트 클론
git clone https://github.com/yourusername/pcbang-order-system.git

# 2. Eclipse STS4에서 Import
File > Import > Existing Maven Projects

# 3. MySQL DB 설정
DB명: pcbang_order
아이디/비밀번호 설정 후 `schema.sql`로 테이블 생성

# 4. 서버 실행
Run As > Run on Server
