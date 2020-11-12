import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    static class Articles {
        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        String title;
        String content;
        String author;

        public Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }


        public String ToString() {
            return String.format("%s - %s: %s", title, content, author);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Articles> articlesList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(", ");
            Articles articles = new Articles(line[0], line[1], line[2]);
            articlesList.add(articles);
        }
        String typeForSort = scanner.nextLine();
        switch (typeForSort) {
            case "title":
                articlesList.stream().sorted((p1, p2) -> p1.getTitle().compareTo(p2.getTitle()))
                        .forEach(articles -> System.out.println(articles.ToString()));
                break;
            case "content":
                articlesList.stream().sorted((p1, p2) -> p1.getContent().compareTo(p2.getContent()))
                        .forEach(articles -> System.out.println(articles.ToString()));
                break;
            case "author":
                articlesList.stream().sorted((p1, p2) -> p1.getAuthor().compareTo(p2.getAuthor()))
                        .forEach(articles -> System.out.println(articles.ToString()));
                break;
        }
    }
}
