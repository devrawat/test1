#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.c.namespace;

public class CalculateInterest {
    private long loan;
    private int durationInMonths;
    private InterestInformation interestInfo;
    public CalculateInterest(long loan, int durationInMonths, InterestInformation interestInfo) {
        this.loan = loan;
        this.durationInMonths = durationInMonths;
        this.interestInfo = interestInfo;
    }
    @Override
    public String toString() {
        return "CalculateInterest [loan=" + loan + ", durationInMonths=" + durationInMonths
            + ", interestInfo=" + interestInfo + "]";
    }

}
