# wise-saying

## 1주차 (2022/02/02)
- 연습 데이터
    - 모든 명언 리스트 전달해주기
        - GET request → response [WordObject: {word: str, img_url: str}]

## 2주차 (2022/02/09)

자동 로그인 기능 구현

- device_id 넘기면 user_id 함께 반환함
- device_id 는 user_id 와 일대일 매칭된다고 가정
- [[Spring JPA] User Entity 생성 오류 해결](https://velog.io/@cozzin/Spring-JPA-User-Entity-%EC%83%9D%EC%84%B1-%EC%98%A4%EB%A5%98-%ED%95%B4%EA%B2%B0)

```bash
 ernest.hong@Ernest  ~  http POST localhost:8080/auto-login device_id=abc
HTTP/1.1 200
Connection: keep-alive
Content-Type: application/json
Date: Wed, 08 Feb 2023 15:17:54 GMT
Keep-Alive: timeout=60
Transfer-Encoding: chunked

{
    "device_id": "abc",
    "userId": "19fac240-13aa-4a52-8d74-aff678acff3a"
}


 ernest.hong@Ernest  ~  http POST localhost:8080/auto-login device_id=abc
HTTP/1.1 200
Connection: keep-alive
Content-Type: application/json
Date: Wed, 08 Feb 2023 15:17:58 GMT
Keep-Alive: timeout=60
Transfer-Encoding: chunked

{
    "device_id": "abc",
    "userId": "19fac240-13aa-4a52-8d74-aff678acff3a"
}
```
