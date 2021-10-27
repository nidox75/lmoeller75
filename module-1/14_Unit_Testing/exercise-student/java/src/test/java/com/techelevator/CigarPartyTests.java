package com.techelevator;


/*public boolean haveParty(int cigars, boolean isWeekend) {
        int minimumCigarCount = 40;
        int maximumCigarCount = 60;

        boolean hasMinimumCigars = cigars >= minimumCigarCount;
        boolean withinMaxRangeOfCigars = (!isWeekend && cigars <= maximumCigarCount) || isWeekend;
        boolean successful = hasMinimumCigars && withinMaxRangeOfCigars;

        return successful;*/

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {
    @Test
    public void Cigar_Minimum_Count_Weekend_False() {
        //Arrange
        CigarParty cp = new CigarParty();


        //ACT
        boolean actual = cp.haveParty(38, false);

        //ASSERT
        Assert.assertEquals("minimum amount of cigars not met", false, actual);

    }

    @Test
    public void Upper_Boundaries_On_The_Weekend() {
        CigarParty cp = new CigarParty();

        Assert.assertEquals("maximum cigars and on weekend", true,
                cp.haveParty(68, true));
    }
    @Test
    public void Negative_Cigars_Weekend_Tf(){

        CigarParty cp = new CigarParty();

        Assert.assertEquals("negative plus true", false,cp.haveParty(-41, true));
        Assert.assertEquals("negative plus true", false,cp.haveParty(-59, false));
    }





}


