package OOP2.yerosha1;

import java.time.LocalDateTime;

public class Date {

    private int day, month, year;
    public Date(int day, int month, int year)
        {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    public Date()
            {
                this(LocalDateTime.now().getDayOfMonth(),
                    LocalDateTime.now().getMonthValue(),
                    LocalDateTime.now().getYear());
            }
    public int getYear()
    {
        return this.year;
    }

    /** returns the month
     * @return the month
     */
    public int getMonth()
    {
        return this.month;
    }

    /** returns the Day
     * @return the day
     */
    public int getDay()
    {
        return this.day;
    }

    /** sets the year.
     * must be a positive 4 digits number
     * @param yearToSet the value to be set
     */
    public void setYear(int yearToSet)
    {
        this.year = yearToSet;
    }

    /** set the month.
     * must be 1-12
     * @param monthToSet the value to be set
     */
    public void setMonth(int monthToSet)
    {
        this.month = monthToSet;
    }

    /** sets the day.
     * must be 1-31
     *  @param dayToSet the value to be set
     */
    public void setDay(int dayToSet)
    {
        this.day = dayToSet;
    }

    /**
     * compares between this date and a given date
     * @param other the given date
     * @return positive value if this date comes after the other date,
     * zero if the dates are equal, and
     * negative value if this date comes before the other date.
     */

    public int compareTo(Date other)
    {
        if (this.year != other.year)
            return (this.year - other.year);
        //equals in years
        if (this.month != other.month)
            return (this.month - other.month);
        //equals also in months
        return (this.day - other.day);
    }

    /**
     * builds String that represents
     * this date in the following format:
     * day.month.year (30.9.1917)
     * @return the String that represents the Date
     */
    public String toString()
    {
        return this.day +"." + this.month + "." + this.year;
    }

}
