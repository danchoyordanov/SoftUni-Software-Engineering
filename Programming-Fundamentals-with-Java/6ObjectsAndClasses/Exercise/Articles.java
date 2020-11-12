import java.util.ArrayList;
        import java.util.List;
import java.util.Scanner;

public class Articles {
    static class Articless {
        String title;
        String content;
        String author;

        public Articless(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void Edit(String newString){
            this.content = newString;
        }
        public void ChangeAuthor(String newAuthor){
            this.author = newAuthor;
        }
        public void Rename(String newTitle){
            this.title = newTitle;
        }
        public String ToString(){
            return String.format("%s - %s: %s",title,content,author);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");
        List<Articless> articlesList = new ArrayList<>();
        Articless articles = new Articless(line[0],line[1], line[2]);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] nextLineForRead = scanner.nextLine().split(": ");
            switch (nextLineForRead[0]){
                case "Edit":
                    articles.Edit(nextLineForRead[1]);
                    break;
                case "ChangeAuthor" :
                    articles.ChangeAuthor(nextLineForRead[1]);
                    break;
                case "Rename" :
                    articles.Rename(nextLineForRead[1]);
                    break;
            }
        }
        System.out.println(articles.ToString());
    }
}
