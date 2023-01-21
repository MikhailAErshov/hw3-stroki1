//Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//Найти позицию подстроки “Java” в строке “I like Java!!!”.
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать строку Java c помощью метода String.substring().

public class Stroki {
    public static void main(String[] args) {
        String str1 = "I like Java!!!";
        System.out.println(str1.startsWith("I like"));
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.replace("a", "o"));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.replace(str1.substring(str1.indexOf("Java"),str1.indexOf("!!!")), ""));
    }
}
