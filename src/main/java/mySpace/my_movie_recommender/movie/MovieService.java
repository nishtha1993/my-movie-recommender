package mySpace.my_movie_recommender.movie;

import ombd.OMDBClient;
import user.UserProfile;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    OMDBClient client = new OMDBClient();
    List<Movie> movieList = new ArrayList<Movie>();
    MovieRecService movieRecommendationService = new MovieRecService();
    /**
     * call ombd with search query obtained by recommendation engine
     * return the top 5 movie names based on the year
     */
    public String whatNext(String searchQuery){
        return client.getMovies(searchQuery);
    }

    public String getSearchQuery(UserProfile userProfile){
        //user a recommendation engine for the user profile to generate a search query

        return null;
    }
}
