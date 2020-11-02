

public class MovieDB {
    int effectiveNoMovies = 0;
    movie[] movieslist = new movie[DEFAULT_SIZE];
    private static final int DEFAULT_SIZE = 2;

    public void add(movie movie) {
    if(movieslist.length == effectiveNoMovies){
        
    }
    movieslist[effectiveNoMovies] = movie;
    effectiveNoMovies++;
    
    }

    void display() {
    for (movie movie : movieslist){
    System.out.println("movie:" + movie.getName()+ "tom and jerry " + movie.getReleaseyear());
    }
    }
    
}
