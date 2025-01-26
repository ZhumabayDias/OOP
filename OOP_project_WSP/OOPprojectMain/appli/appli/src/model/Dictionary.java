package model;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	private HashMap<String, HashMap<String, String>> dictionary;
	
	public Dictionary() {
		dictionary = new HashMap<>();
		HashMap<String, String> enToRu = new HashMap<>();
		//BaseView
		enToRu.put("Welcome to WSP\nSelect language: ", "Добро пожаловать в WSP\nВыберите язык: ");
		enToRu.put("Select your role: ", "Выберите вашу роль: ");
		enToRu.put("0. Quit\n1. Admin\n2. Teacher\n3. Manager\n4. Finance Manager\n5. Student", "0. Выход\n1. Администратор\n2. Учитель\n3. Менеджер\n4. Финансовый менеджер\n5. Студент");
		enToRu.put("Goodbye!", "До свидания!");
		enToRu.put("Invalid option. Try again.", "Неверный выбор. Попробуйте снова.");
		enToRu.put("Please, enter your credentials:", "Пожалуйста, введите ваши учетные данные:");
		enToRu.put("Username: ", "Имя пользователя: ");
		enToRu.put("Password: ", "Пароль: ");
		enToRu.put("Unknown user type.", "Неизвестный тип пользователя.");
		enToRu.put("Wrong login or password. Please try again.", "Неверный логин или пароль. Пожалуйста, попробуйте снова.");
		enToRu.put("Invalid input. Please enter a number.", "Неверный ввод. Пожалуйста, введите число.");
		//AdminView
		enToRu.put("Welcome to Admin screen!", "Добро пожаловать на экран администратора!");
		enToRu.put("0. Quit\n1. Create User\n2. Remove User\n3. View Users", "0. Выход\n1. Создать пользователя\n2. Удалить пользователя\n3. Просмотреть пользователей");
		enToRu.put("Enter 0 to quit\n1. Teacher\n2. Student\n3. Manager\n4. Finance Manager", "Введите 0 для выхода\n1. Учитель\n2. Студент\n3. Менеджер\n4. Финансовый менеджер");
		enToRu.put("0. Quit\n1. Teacher\n2. Student\n3. Manager\n4. Finance Manager", "0. Выход\n1. Учитель\n2. Студент\n3. Менеджер\n4. Финансовый менеджер");
		enToRu.put("User email: ", "Электронная почта пользователя: ");
		enToRu.put("User password: ", "Пароль пользователя: ");
		enToRu.put("Teacher created successfully.", "Учитель успешно создан.");
		enToRu.put("Failed to create teacher.", "Не удалось создать учителя.");
		enToRu.put("Student created successfully.", "Студент успешно создан.");
		enToRu.put("Failed to create student.", "Не удалось создать студента.");
		enToRu.put("Manager created successfully.", "Менеджер успешно создан.");
		enToRu.put("Failed to create manager.", "Не удалось создать менеджера.");
		enToRu.put("0. Quit\n1. Teacher\n2. Student\n3. Manager\n4. Finance Manager\n5. All Users", "0. Выход\n1. Учитель\n2. Студент\n3. Менеджер\n4. Финансовый менеджер\n5. Все пользователи");
		enToRu.put("Loading teachers...", "Загрузка учителей...");
		enToRu.put("No teachers found.", "Учителя не найдены.");
		enToRu.put("Loading students...", "Загрузка студентов...");
		enToRu.put("No student found.", "Студенты не найдены.");
		enToRu.put("Loading manager...", "Загрузка менеджера...");
		enToRu.put("No manager found.", "Менеджеры не найдены.");
		enToRu.put("Loading finance manager...", "Загрузка финансового менеджера...");
		enToRu.put("No finance manager found.", "Финансовые менеджеры не найдены.");
		enToRu.put("Loading users...", "Загрузка пользователей...");
		enToRu.put("No users found.", "Пользователи не найдены.");
		//FinanceManagerView
		enToRu.put("Finance Manager set successfully.", "Финансовый менеджер успешно установлен.");
		enToRu.put("Error: User is not a Finance Manager.", "Ошибка: Пользователь не является финансовым менеджером.");
		enToRu.put("Welcome, Finance Manager!", "Добро пожаловать, финансовый менеджер!");
		enToRu.put("0. Exit\n1. Give a salary\n2. View total budget", "0. Выход\n1. Выплатить зарплату\n2. Просмотреть общий бюджет");
		enToRu.put("0. Quit\n1. Give salary", "0. Выход\n1. Выплатить зарплату");

		//ManagerView
		enToRu.put("\"Welcome, Manager!\"", "\"Добро пожаловать, менеджер!\"");
		enToRu.put("\"0. Exit\\n1. Add News\"", "\"0. Выход\\n1. Добавить новость\"");
		enToRu.put("\"2. Remove News\"", "\"2. Удалить новость\"");
		enToRu.put("\"3. Create course\"", "\"3. Создать курс\"");
		enToRu.put("\"4. View course applications\"", "\"4. Просмотреть заявки на курс\"");
		enToRu.put("\"5. Students in the system\"", "\"5. Студенты в системе\"");
		enToRu.put("\"6. Teachers in the system\"", "\"6. Учителя в системе\"");
		enToRu.put("\"7. All courses in the system\"", "\"7. Все курсы в системе\"");
		enToRu.put("8. Assign teacher for course", "8. Назначить учителя на курс");
		enToRu.put("9. Student in the course", "9. Студент на курсе");
		enToRu.put("10. View lessons", "10. Просмотр уроков");
		enToRu.put("11. Teacher in course", "11. Учитель на курсе");
		enToRu.put("12. Teacher in lesson", "12. Учитель на уроке");
		enToRu.put("13. Send message", "13. Отправить сообщение");
		enToRu.put("14. View messages", "14. Просмотр сообщений");
		enToRu.put("Loading", "Загрузка");
		enToRu.put("Name: ", "Имя: ");
		enToRu.put("Message: ", "Сообщение: ");
		enToRu.put("Message successfully sent!", "Сообщение успешно отправлено!");
		enToRu.put("Succesfully", "Успешно");
		enToRu.put("Topic: ", "Тема: ");
		enToRu.put("Main: ", "Основное: ");
		enToRu.put("You successfully added latest News!", "Вы успешно добавили последнюю новость!");
		enToRu.put("0. Quit", "0. Выход");
		enToRu.put("Which news you want to delete: ", "Какую новость вы хотите удалить: ");
		enToRu.put("You successfully deleted this new", "Вы успешно удалили эту новость");
		enToRu.put("No news with this id", "Новостей с этим ID не найдено");
		enToRu.put("Course Code: ", "Код курса: ");
		enToRu.put("Course name: ", "Название курса: ");
		enToRu.put("Course credits: ", "Кредиты курса: ");
		enToRu.put("Course Year: ", "Год курса: ");
		enToRu.put("Available course types: ", "Доступные типы курса: ");
		enToRu.put("Course type: ", "Тип курса: ");
		enToRu.put("Available course schools: ", "Доступные школы курса: ");
		enToRu.put("School type: ", "Тип школы: ");
		enToRu.put("Course created successfully.", "Курс успешно создан.");
		enToRu.put("Failed to create course.", "Не удалось создать курс.");
		enToRu.put("Loading courses...", "Загрузка курсов...");
		enToRu.put("No courses found.", "Курсы не найдены.");
		enToRu.put("Do you wanna create new course?", "Хотите создать новый курс?");
		enToRu.put("1. Yes", "1. Да");
		enToRu.put("2. No", "2. Нет");
		enToRu.put("What ypu will choose?", "Что вы выберете?");
		enToRu.put("Create lesson for course:", "Создать урок для курса:");
		enToRu.put("Create lesson...", "Создание урока...");
		enToRu.put("Lesson topic:", "Тема урока:");
		enToRu.put("Available lesson types: ", "Доступные типы уроков: ");
		enToRu.put("Lesson type: ", "Тип урока: ");
		enToRu.put("Lesson start (HH:mm): ", "Начало урока (чч:мм): ");
		enToRu.put("Lesson end (HH:mm): ", "Конец урока (чч:мм): ");
		enToRu.put("Weekly lesson plan(Monday, etc.): ", "Еженедельный план уроков (Понедельник и т. д.): ");
		enToRu.put("Lesson type(LECTURE/PRACTICE): ", "Тип урока (ЛЕКЦИЯ/ПРАКТИКА): ");
		enToRu.put("Loading teachers...", "Загрузка учителей...");
		enToRu.put("No teachers found.", "Учителей не найдено.");
		enToRu.put("Loading students...", "Загрузка студентов...");
		enToRu.put("No student found.", "Студенты не найдены.");
		enToRu.put("Application number:", "Номер заявки:");
		enToRu.put("1. Approve", "1. Одобрить");
		enToRu.put("2. Reject", "2. Отклонить");
		enToRu.put("What did you choose?", "Что вы выбрали?");
		enToRu.put("Loading courses...", "Загрузка курсов...");
		enToRu.put("No courses found.", "Курсы не найдены.");
		enToRu.put("Assigning...", "Назначение...");
		enToRu.put("1. For course", "1. Для курса");
		enToRu.put("2. For lesson", "2. Для урока");
		enToRu.put("I Choose:", "Я выбираю:");
		enToRu.put("No teacher found.", "Учитель не найден.");
		enToRu.put("Teacher added", "Учитель добавлен");
		enToRu.put("This lesson is already taught by another teacher. Are you sure you want to change it?", "Этот урок уже ведет другой учитель. Вы уверены, что хотите его изменить?");
		enToRu.put("The teacher has been successfully assigned to the lesson: ", "Учитель успешно назначен на урок: ");
		enToRu.put("Error", "Ошибка");
		enToRu.put("Loading courses...", "Загрузка курсов...");
		enToRu.put("No courses found.", "Курсы не найдены.");

		//StudentView
		enToRu.put("Welcome, Student!", "Добро пожаловать, студент!");
		enToRu.put("0. Exit\n1. View News", "0. Выход\n1. Просмотреть новости");
		enToRu.put("2. View courses", "2. Просмотреть курсы");
		enToRu.put("3. Add application for course", "3. Подать заявку на курс");
		enToRu.put("4. My application for course", "4. Моя заявка на курс");
		enToRu.put("5. Send message", "5. Отправить сообщение");
		enToRu.put("6. View messages", "6. Просмотр сообщений");
		enToRu.put("7. Mark Attendance", "7. Отметить посещаемость");
		enToRu.put("8. View Attendance", "8. Просмотр посещаемости");
		enToRu.put("Choose subject:", "Выберите предмет:");
		enToRu.put("Invalid option. Please try again.", "Неверный вариант. Попробуйте снова.");
		enToRu.put("Open attendances:", "Открыть посещаемость:");
		enToRu.put("It is all list of messages", "Это весь список сообщений");
		enToRu.put("Name: ", "Имя: ");
		enToRu.put("Message: ", "Сообщение: ");
		enToRu.put("User not found.", "Пользователь не найден.");
		enToRu.put("Message successfully sent!", "Сообщение успешно отправлено!");
		enToRu.put("0. Quit", "0. Выход");
		enToRu.put("No courses enrolled.", "Вы не записаны на курсы.");
		enToRu.put("Enrolled Courses:", "Записанные курсы:");
		enToRu.put("No courses for registration", "Нет курсов для регистрации");
		enToRu.put("Successfully added!", "Успешно добавлено!");
		enToRu.put("Invalid index. Please try again.", "Неверный индекс. Попробуйте снова.");
		enToRu.put("9. View Transcript", "9. Посмотреть транскрипт");
		enToRu.put(" Semester:", " Семестер");

		//TeacherView
		enToRu.put("Welcome, Teacher!", "Добро пожаловать, преподаватель!");
		enToRu.put("0. Quit\n1. View Data", "0. Выход\n1. Просмотреть данные");
		enToRu.put("2. View messages", "2. Просмотр сообщений");
		enToRu.put("3. View Lessons", "3. Просмотр уроков");
		enToRu.put("4. View students", "4. Просмотр студентов");
		enToRu.put("5. Put Attestation", "5. Поставить аттестацию");
		enToRu.put("6. Add Attendance", "6. Добавить посещаемость");
		enToRu.put("Choose", "Выберите");
		enToRu.put("Course choosed", "Курс выбран");
		enToRu.put("Choose lesson:", "Выберите урок:");
		enToRu.put("Free attendance? y/n", "Свободная посещаемость? y/n");
		enToRu.put("How long?", "Как долго?");
		enToRu.put("Choose student:", "Выберите студента:");
		enToRu.put("It is all courses", "Это все курсы");
		enToRu.put("It is all list of messages", "Это весь список сообщений");

		
		
		
		
		
		dictionary.put("en-ru", enToRu);
		
		HashMap<String, String> enToKz = new HashMap<>();
		//BaseView
		enToKz.put("Welcome to WSP\nSelect language: ", "WSP-ге қош келдіңіз\nТіл таңдаңыз: ");
		enToKz.put("Select your role: ", "Рөліңізді таңдаңыз: ");
		enToKz.put("0. Quit\n1. Admin\n2. Teacher\n3. Manager\n4. Finance Manager\n5. Student", "0. Шығу\n1. Әкімші\n2. Мұғалім\n3. Менеджер\n4. Қаржы менеджері\n5. Студент");
		enToKz.put("Goodbye!", "Сау болыңыз!");
		enToKz.put("Invalid option. Try again.", "Жарамсыз опция. Қайталап көріңіз.");
		enToKz.put("Please, enter your credentials:", "Кіріс деректеріңізді енгізіңіз:");
		enToKz.put("Username: ", "Пайдаланушы аты: ");
		enToKz.put("Password: ", "Құпиясөз: ");
		enToKz.put("Unknown user type.", "Белгісіз пайдаланушы түрі.");
		enToKz.put("Wrong login or password. Please try again.", "Қате логин немесе құпия сөз. Қайталап көріңіз.");
		enToKz.put("Invalid input. Please enter a number.", "Қате енгізу. Санды енгізіңіз.");

		//AdminView
		enToKz.put("Welcome to Admin screen!", "Әкімші экранына қош келдіңіз!");
		enToKz.put("0. Quit\n1. Create User\n2. Remove User\n3. View Users", "0. Шығу\n1. Пайдаланушы жасау\n2. Пайдаланушыны жою\n3. Пайдаланушыларды көру");
		enToKz.put("Enter 0 to quit\n1. Teacher\n2. Student\n3. Manager\n4. Finance Manager", "Шығу үшін 0 басыңыз\n1. Мұғалім\n2. Студент\n3. Менеджер\n4. Қаржы менеджері");
		enToKz.put("0. Quit\n1. Teacher\n2. Student\n3. Manager\n4. Finance Manager", "0. Шығу\n1. Мұғалім\n2. Студент\n3. Менеджер\n4. Қаржы менеджері");
		enToKz.put("User email: ", "Пайдаланушының электрондық пошта мекенжайы: ");
		enToKz.put("User password: ", "Пайдаланушының құпия сөзі: ");
		enToKz.put("Teacher created successfully.", "Мұғалім сәтті жасалды.");
		enToKz.put("Failed to create teacher.", "Мұғалімді жасау сәтсіз аяқталды.");
		enToKz.put("Student created successfully.", "Студент сәтті жасалды.");
		enToKz.put("Failed to create student.", "Студентті жасау сәтсіз аяқталды.");
		enToKz.put("Manager created successfully.", "Менеджер сәтті жасалды.");
		enToKz.put("Failed to create manager.", "Менеджерді жасау сәтсіз аяқталды.");
		enToKz.put("0. Quit\n1. Teacher\n2. Student\n3. Manager\n4. Finance Manager\n5. All Users", "0. Шығу\n1. Мұғалім\n2. Студент\n3. Менеджер\n4. Қаржы менеджері\n5. Барлық пайдаланушылар");
		enToKz.put("Loading teachers...", "Мұғалімдер жүктелуде...");
		enToKz.put("No teachers found.", "Мұғалімдер табылған жоқ.");
		enToKz.put("Loading students...", "Студенттер жүктелуде...");
		enToKz.put("No student found.", "Студенттер табылған жоқ.");
		enToKz.put("Loading manager...", "Менеджер жүктелуде...");
		enToKz.put("No manager found.", "Менеджерлер табылған жоқ.");
		enToKz.put("Loading finance manager...", "Қаржы менеджері жүктелуде...");
		enToKz.put("No finance manager found.", "Қаржы менеджері табылған жоқ.");
		enToKz.put("Loading users...", "Пайдаланушылар жүктелуде...");
		enToKz.put("No users found.", "Пайдаланушылар табылған жоқ.");

		//FinanceManagerView
		enToKz.put("Finance Manager set successfully.", "Қаржы менеджері сәтті тағайындалды.");
		enToKz.put("Error: User is not a Finance Manager.", "Қате: Пайдаланушы Қаржы менеджері емес.");
		enToKz.put("Welcome, Finance Manager!", "Қош келдіңіз, Қаржы менеджері!");
		enToKz.put("0. Exit\n1. Give a salary\n2. View total budget", "0. Шығу\n1. Жалақы беру\n2. Жалпы бюджетті көру");
		enToKz.put("0. Quit\n1. Give salary", "0. Шығу\n1. Жалақы беру");

		//ManagerView
		enToKz.put("\"Welcome, Manager!\"", "\"Қош келдіңіз, Менеджер!\"");
		enToKz.put("\"0. Exit\\n1. Add News\"", "\"0. Шығу\\n1. Жаңалық қосу\"");
		enToKz.put("\"2. Remove News\"", "\"2. Жаңалықты жою\"");
		enToKz.put("\"3. Create course\"", "\"3. Курс жасау\"");
		enToKz.put("\"4. View course applications\"", "\"4. Курс өтінімдерін қарау\"");
		enToKz.put("\"5.  Students in the system\"", "\"5. Жүйедегі студенттер\"");
		enToKz.put("\"6.  Teachers in the system\"", "\"6. Жүйедегі мұғалімдер\"");
		enToKz.put("\"7.  All courses in the system\"", "\"7. Жүйедегі барлық курстар\"");
		enToKz.put("8.  Assign teacher for course", "8. Курсты оқыту үшін мұғалімді тағайындау");
		enToKz.put("9.  Student in the course", "9. Курстағы студент");
		enToKz.put("10.  View lessons", "10. Сабақтарды көру");
		enToKz.put("11.  Teacher in course", "11. Курстағы мұғалім");
		enToKz.put("12.  Teacher in lesson", "12. Сабақтағы мұғалім");
		enToKz.put("13.  Send message", "13. Хабарлама жіберу");
		enToKz.put("14. View messages", "14. Хабарламаларды қарау");
		enToKz.put("Loading", "Жүктелуде");
		enToKz.put("Name: ", "Аты: ");
		enToKz.put("Message: ", "Хабарлама: ");
		enToKz.put("Message successfully sent!", "Хабарлама сәтті жіберілді!");
		enToKz.put("Succesfully", "Сәтті");
		enToKz.put("Topic: ", "Тақырыбы: ");
		enToKz.put("Main: ", "Негізгі: ");
		enToKz.put("You successfully added latest News!", "Сіз соңғы жаңалықтарды сәтті қостыңыз!");
		enToKz.put("0. Quit", "0. Шығу");
		enToKz.put("Which news you want to delete: ", "Қай жаңалықты жойғыңыз келеді: ");
		enToKz.put("You successfully deleted this new", "Сіз бұл жаңалықты сәтті жойдыңыз");
		enToKz.put("No news with this id", "Бұл ID-мен жаңалықтар табылмады");
		enToKz.put("Course Code: ", "Курс коды: ");
		enToKz.put("Course name: ", "Курс аты: ");
		enToKz.put("Course credits: ", "Курс несиелері: ");
		enToKz.put("Course Year: ", "Курс жылы: ");
		enToKz.put("Available course types: ", "Қол жетімді курс түрлері: ");
		enToKz.put("Course type: ", "Курс түрі: ");
		enToKz.put("Available course schools: ", "Қол жетімді курс мектептері: ");
		enToKz.put("School type: ", "Мектеп түрі: ");
		enToKz.put("Course created successfully.", "Курс сәтті жасалды.");
		enToKz.put("Failed to create course.", "Курс жасау сәтсіз аяқталды.");
		enToKz.put("Loading courses...", "Курстар жүктелуде...");
		enToKz.put("No courses found.", "Курстар табылған жоқ.");
		enToKz.put("Do you wanna create new course?", "Жаңа курс жасағыңыз келе ме?");
		enToKz.put("1. Yes", "1. Иә");
		enToKz.put("2. No", "2. Жоқ");
		enToKz.put("What ypu will choose?", "Қандай таңдауды жасайсыз?");
		enToKz.put("Create lesson for course:", "Курс үшін сабақ жасау:");
		enToKz.put("Create lesson...", "Сабақ жасау...");
		enToKz.put("Lesson topic:", "Сабақ тақырыбы:");
		enToKz.put("Available lesson types: ", "Қол жетімді сабақ түрлері: ");
		enToKz.put("Lesson type: ", "Сабақ түрі: ");
		enToKz.put("Lesson start (HH:mm): ", "Сабақ басталуы (HH:mm): ");
		enToKz.put("Lesson end (HH:mm): ", "Сабақ аяқталуы (HH:mm): ");
		enToKz.put("Weekly lesson plan(Monday, etc.): ", "Апталық сабақ жоспары (Дүйсенбі, т.б.): ");
		enToKz.put("Lesson type(LECTURE/PRACTICE): ", "Сабақ түрі (ЛЕКЦИЯ/ПРАКТИКА): ");
		enToKz.put("Loading teachers...", "Мұғалімдер жүктелуде...");
		enToKz.put("No teachers found.", "Мұғалімдер табылмады.");
		enToKz.put("Loading students...", "Студенттер жүктелуде...");
		enToKz.put("No student found.", "Студенттер табылмады.");
		enToKz.put("Application number:", "Өтініш нөмірі:");
		enToKz.put("1. Approve", "1. Қолдау");
		enToKz.put("2. Reject", "2. Қабылдамау");
		enToKz.put("What did you choose?", "Сіз не таңдадыңыз?");
		enToKz.put("Loading courses...", "Курстар жүктелуде...");
		enToKz.put("No courses found.", "Курстар табылмады.");
		enToKz.put("Assigning...", "Тағайындау...");
		enToKz.put("1. For course", "1. Курс үшін");
		enToKz.put("2. For lesson", "2. Сабақ үшін");
		enToKz.put("I Choose:", "Мен таңдаймын:");
		enToKz.put("No teacher found.", "Мұғалімдер табылмады.");
		enToKz.put("Teacher added", "Мұғалім қосылды");
		enToKz.put("This lesson is already taught by another teacher. Are you sure you want to change it?", "Бұл сабақты басқа мұғалім оқытады. Сіз оны ауыстырғыңыз келетініне сенімдісіз бе?");
		enToKz.put("The teacher has been successfully assigned to the lesson: ", "Мұғалім сабаққа сәтті тағайындалды: ");
		enToKz.put("Error", "Қате");
		enToKz.put("Loading courses...", "Курстар жүктелуде...");
		enToKz.put("No courses found.", "Курстар табылмады.");

		//StudentView
		enToKz.put("Welcome, Student!", "Қош келдіңіз, Студент!");
		enToKz.put("0. Exit\n1. View News", "0. Шығу\n1. Жаңалықтарды көру");
		enToKz.put("2. View courses", "2. Курстарды көру");
		enToKz.put("3. Add application for course", "3. Курсқа өтінім қосу");
		enToKz.put("4. My application for course", "4. Менің курсқа өтінімім");
		enToKz.put("5. Send message", "5. Хабарлама жіберу");
		enToKz.put("6. View messages", "6. Хабарламаларды көру");
		enToKz.put("7. Mark Attendance", "7. Қатысуды белгілеу");
		enToKz.put("8. View Attendance", "8. Қатысуды көру");
		enToKz.put("Choose subject:", "Пәнді таңдаңыз:");
		enToKz.put("Invalid option. Please try again.", "Қате таңдау. Қайталап көріңіз.");
		enToKz.put("Open attendances:", "Қатысуларды ашу:");
		enToKz.put("It is all list of messages", "Бұл барлық хабарламалардың тізімі");
		enToKz.put("Name: ", "Аты: ");
		enToKz.put("Message: ", "Хабарлама: ");
		enToKz.put("User not found.", "Пайдаланушы табылмады.");
		enToKz.put("Message successfully sent!", "Хабарлама сәтті жіберілді!");
		enToKz.put("0. Quit", "0. Шығу");
		enToKz.put("No courses enrolled.", "Курсқа тіркелмеген.");
		enToKz.put("Enrolled Courses:", "Тіркелген курстар:");
		enToKz.put("No courses for registration", "Тіркелу үшін курстар жоқ");
		enToKz.put("Successfully added!", "Сәтті қосылды!");
		enToKz.put("Invalid index. Please try again.", "Қате индекс. Қайталап көріңіз.");
		enToKz.put("9. View Transcript", "9. Транскриптті қарау");
		enToKz.put(" Semester:", " Семестер");

		//TeacherView
		enToKz.put("Welcome, Teacher!", "Қош келдіңіз, Мұғалім!");
		enToKz.put("0. Quit\n1. View Data", "0. Шығу\n1. Мәліметтерді көру");
		enToKz.put("2. View messages", "2. Хабарламаларды көру");
		enToKz.put("3. View Lessons", "3. Сабақтарды көру");
		enToKz.put("4. View students", "4. Студенттерді көру");
		enToKz.put("5. Put Attestation", "5. Аттестация қою");
		enToKz.put("6. Add Attendance", "6. Қатысуды қосу");
		enToKz.put("Choose", "Таңдаңыз");
		enToKz.put("Course choosed", "Курс таңдалды");
		enToKz.put("Choose lesson:", "Сабақты таңдаңыз:");
		enToKz.put("Free attendance? y/n", "Бос қатысу? иә/жоқ");
		enToKz.put("How long?", "Қанша уақыт?");
		enToKz.put("Choose student:", "Студентті таңдаңыз:");
		enToKz.put("It is all courses", "Бұл барлық курстар");
		enToKz.put("It is all list of messages", "Бұл барлық хабарламалар тізімі");

		
		dictionary.put("en-kz", enToKz);
	}
	
	public HashMap<String, HashMap<String, String>> getMap(){
		return this.dictionary;
	}
}
