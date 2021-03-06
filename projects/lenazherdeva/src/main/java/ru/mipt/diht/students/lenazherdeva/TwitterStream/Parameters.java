package ru.mipt.diht.students.lenazherdeva.twitterStream; /**
 * Created by admin on 27.09.2015.
 */
//parsing using by jcommander
import com.beust.jcommander.Parameter;
import com.beust.jcommander.validators.PositiveInteger;

public class Parameters {
    private static final int STANDART_LIMIT = 100;
    @Parameter(names = {"-l", "--limit"},
            validateWith = PositiveInteger.class,
            description =
                    "Number of tweets to show(only for no streaming mode)")
    private int limit = STANDART_LIMIT;

    @Parameter(names = {"-s", "--stream"},
            description = "Stream")
    private boolean isStream = false;

    @Parameter(names = {"--hideRetweets"},
            description = "HideRetweets")
    private boolean hideRetweets = false;

    @Parameter(names = { "-h", "--help"},
            description = "Help mode", help = true)
    private boolean help = false;

    @Parameter(names = {"-p", "--place"},
            description = "location or 'nearby'")
    private String place = "";

    @Parameter(names = {"-q", "--query"},
            description = "Query or keywords for stream", required = true)
    private String query = "";

    public final boolean isStream() {
        return isStream;
    }

    public final boolean hideRetweets() {
        return hideRetweets;
    }

    public final int getLimit() {
        return limit;
    }

    public final boolean isHelp() {
        return help;
    }

    public final String getLocation() {
        return place;
    }
    public final String getQuery() {
        return query;
    }
    public final void setQuery(String queryDef) {
        query = queryDef;
    }

    public final void setLimit(Integer limitDef) {
        limit = limitDef;
    }

    public final void setStream(boolean streamDef) {
        isStream = streamDef;
    }

    public final void setHideRetwitts(boolean hideRetwittsDef) {
        hideRetweets = hideRetwittsDef;
    }

    public final void setHelp(boolean helpDef) {
        help = helpDef;
    }

    public final void setPlace(String placeDef) {
        place = placeDef;
    }
}

