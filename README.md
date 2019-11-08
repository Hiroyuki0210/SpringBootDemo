# SpringBootDemo

## 概要  
Spring Boot のデモアプリです。  
本アプリは、springの機能である  
・spring-web  
・spring-security  
を簡単に見るためのものです。  

## 実行方法  
以下のコマンドを入力して、本アプリを実行します。  
` mvnw spring-boot:run `  
次に、ブラウザ上で以下のURLを入力します。  
` http://localhost:8080 `  
  
ページにアクセスすると、認証要求されます。  
ユーザー名は"user" 、パスワードはアプリ起動時にコンソール上に表示されたパスワードを入力します。  
コンソールでパスワードは以下のように表示されます。  
`Using generated security password: 2b2e8cac-4c35-414a-84da-b39aa8d421da `  
認証をパスすると、ブラウザ上に'hello'が表示されます。  
