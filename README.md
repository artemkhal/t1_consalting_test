<h1 align="center">t1_consalting_test</h1>
<h3>Описание</h3>
Проект является реализацией тестового задания для T1 Консалтинг.<br><br>
Данная реализация REST API вычисляет частоту встречи символов по заданной строке двумя способами:
<ul>
  <li>
    при запросе методом <code>POST</code> по пути <code>/calculate_symbols</code> в параметре <code>text</code> передается строка, из которой вычисляется частота 
    встречаемости <b>всех символов</b>
  </li>
  <li>
    при запросе методом <code>POST</code> по пути <code>/calculate_letters</code> в параметре <code>text</code> передается строка, из которой вычисляется 
    частота встречаемости <b>только букв</b> русского и английского алфавитов
  </li>
</ul>

<h3>Запуск</h3>
Для запуска выполните следующие действия:
<ol>
  <li>
    Скачайте проект
  </li>
  <li>
    Откройте терминал из корня проекта
  </li>
  <li>
    Введите команду <code>mvn clean install</code>
  </li>
  <li>
    Введите команду <code>java -jar target/t1_consalting_test-0.0.1-SNAPSHOT.jar</code>
  </li>
</ol>
<h3>Использование</h3>
Для использования проекта Вам понадобится программа Postman<br><br>
<ol>
  <li>Запустите Postman</li>
  <li>В поле метод запроса выберете <code>POST</code></li>
  <li>В поле url введите домен <code>http://localhost:8080</code> и интересующий вас метод вычисления(<code>/calculate_letters</code> или <code>/calculate_symbols</code>)</li>
  <li>В поле <code>Key</code> раздела параметром запроса введите наименование параметра - <code>text</code> </li>
  <li>В поле <code>Value</code> введите текст для вычисления</li>
  <li>нажмите Отправить и в поле внизу появится результат вычисления</li>
</ol><br>
Пример:
<img src="https://raw.githubusercontent.com/artemkhal/t1_consalting_test/master/img/example.png" alt="Пример"/>

