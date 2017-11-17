package edu.wwu.cs.deadwood;

import edu.wwu.cs.deadwood.assets.Role;
import edu.wwu.cs.deadwood.assets.Room;

/**
 * @author Connor Hollasch
 * @since October 31, 1:42 PM
 */
public class Player
{
    private final Color color;

    private int creditCount;
    private int dollarCount;
    private int rank;

    private int practiceChips;

    private Room currentRoom;
    private Role activeRole;

    public Player (final Color color)
    {
        this.color = color;

        this.creditCount = 0;
        this.dollarCount = 0;
        this.rank = 1;
        this.practiceChips = 0;
        this.activeRole = null;
    }

    public int getScore ()
    {
        return getCreditCount() + getDollarCount() + (5 * getRank());
    }

    public Color getColor ()
    {
        return this.color;
    }

    public int getCreditCount ()
    {
        return this.creditCount;
    }

    public void setCreditCount (final int creditCount)
    {
        this.creditCount = creditCount;
    }

    public int getDollarCount ()
    {
        return this.dollarCount;
    }

    public void setDollarCount (final int dollarCount)
    {
        this.dollarCount = dollarCount;
    }

    public int getRank ()
    {
        return this.rank;
    }

    public void setRank (final int rank)
    {
        this.rank = rank;
    }

    public int getPracticeChips ()
    {
        return this.practiceChips;
    }

    public void setPracticeChips (final int practiceChips)
    {
        this.practiceChips = practiceChips;
    }

    public Room getCurrentRoom ()
    {
        return this.currentRoom;
    }

    public void setCurrentRoom (final Room currentRoom)
    {
        this.currentRoom = currentRoom;
    }

    public Role getActiveRole ()
    {
        return this.activeRole;
    }

    public void setActiveRole (final Role activeRole)
    {
        this.activeRole = activeRole;
    }

    public enum Color
    {
        BLUE,
        CYAN,
        GREEN,
        ORANGE,
        PINK,
        RED,
        VIOLET,
        YELLOW
    }
}
