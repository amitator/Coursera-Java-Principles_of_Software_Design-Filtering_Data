package src.org.courcera.psd;

/**
 * src.org.courcera.psd.Filter interface.
 * 
 * @author (Igor Prus)
 * @version (0.1)
 */
public interface Filter
{
    public String getName();
    public  boolean satisfies(QuakeEntry qe); 
}
