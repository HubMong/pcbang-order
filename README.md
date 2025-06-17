# 🍜 PC방 푸드 주문 및 포인트 적립 시스템

## 📌 프로젝트 개요

이 프로젝트는 **PC방 이용 고객**을 대상으로, 음식 주문 기능과 **포인트 적립/사용 시스템**을 제공하는 웹 애플리케이션입니다.  
고객은 주문한 음식 금액에 따라 포인트를 적립받을 수 있으며, 적립된 포인트는 이벤트 참여, 할인 쿠폰 교환, 또는 결제 시 할인에 사용할 수 있습니다.


---

## 🛠 사용 기술 스택

- **Frontend**: HTML5, CSS3, JavaScript
- **Backend**: Java (Spring Boot), JSP/Servlet (STS4)
- **Database**: MySQL
- **Build & Server**: Apache Tomcat 9, Maven
- **IDE**: Eclipse (Spring Tool Suite 4)

---

## ✅ 주요 기능

- 🛒 메뉴 선택 및 장바구니 담기
- 💳 결제 수단 선택 (현금, 카드, 카카오페이)
- ⭐ 포인트 적립 (주문 금액 기준 자동 적립)
- 🔁 포인트 사용 (결제 시 할인 적용)
- 🎁 포인트로 이벤트/쿠폰 교환 기능
- 🧾 주문 내역 및 적립 내역 조회
- 🔐 로그인/회원가입 및 세션 처리

---

## 🖼️ 주요 화면

> 이미지 삽입 예정  
> 예: `/img/main-menu.png`, `/img/cart-view.png`, `/img/point-history.png` 등

---

## 🚀 실행 방법

```bash
# 1. 프로젝트 클론
git clone https://github.com/yourusername/pcbang-order-system.git

# 2. Eclipse STS4에서 Import
File > Import > Existing Maven Projects > 해당 폴더 선택

# 3. MySQL DB 설정
- DB 이름: pcbang_order
- 테이블: users, orders, menu, point_history 등

# 4. Tomcat 서버 실행
Run As > Run on Server
