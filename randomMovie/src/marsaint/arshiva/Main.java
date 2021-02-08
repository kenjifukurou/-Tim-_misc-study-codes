package marsaint.arshiva;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class Extraction extends Movie {
    public Extraction() {
        super("Extraction");
    }
    @Override
    public String plot() {
        return "Extraction plots";
    }
}

class JohnWick3 extends Movie {
    public JohnWick3() {
        super("John Wick 3");
    }
    @Override
    public String plot() {
        return "John Wick 3 plot";
    }
}

class Emma extends Movie {
    public Emma() {
        super("Emma");
    }
    @Override
    public String plot() {
        return "Emma plot";
    }
}

class Unknown extends Movie {
    public Unknown() {
        super("Unknown");
    }
    // no override
}


public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            Movie movie = randomMovie();
            System.out.println(movie.getName() + "\n" + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumbers = (int)(Math.random() * 4) + 1;
        Movie watchMovie;
        switch (randomNumbers) {
            case 1:
                System.out.println("case 1");
                watchMovie = new Extraction();
                break;
            case 2:
                System.out.println("case 2");
                watchMovie = new JohnWick3();
                break;
            case 3:
                System.out.println("case 3");
                watchMovie = new Emma();
                break;
            case 4:
                System.out.println("case 4");
                watchMovie = new Unknown();
                break;
            default:
                System.out.println("error");
                watchMovie = new Movie("null");
                break;
        }
        return watchMovie;
    }
}
