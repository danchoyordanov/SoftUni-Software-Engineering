import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        String typeList;
        String name;
        String time;

        public void getTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void getName(String name) {
            this.name = name;
        }

        public void getTime(String name) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Song> songs = new ArrayList<>();
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("_");
            Song song = new Song();
            song.typeList = input[0];
            song.name = input[1];
            song.time = input[2];
            songs.add(song);
        }
        String typeInput = scanner.nextLine();
        if (typeInput.equals("all")) {
            int i = 0;
            while (i < songs.size()) {
                Song songg = songs.get(i);
                System.out.println(songg.name);
                i++;
            }
        } else {
            for (int i = 0; i < songs.size(); i++) {
                Song songg = songs.get(i);
                if (typeInput.equals(songg.typeList)) {
                    System.out.println(songg.name);
                }
            }
        }
    }
}
