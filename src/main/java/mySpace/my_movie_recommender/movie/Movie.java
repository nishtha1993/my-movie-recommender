package mySpace.my_movie_recommender.movie;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@Setter
@Getter
public class Movie {
    private String movieName;
    private String year;
    private boolean isWatched;
}
