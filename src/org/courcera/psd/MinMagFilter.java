package src.org.courcera.psd;

/**
 * This is MinMaxFilter. Takes MIN magnitude and returnes array of quakes above or equals minMagnitude.
 * 
 * @author (Igor Prus)
 * @version (0.1)
 */
public class MinMagFilter implements Filter
{
    private double magMin; 
    
    public MinMagFilter(double min) { 
        magMin = min;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return qe.getMagnitude() >= magMin; 
    } 

}
