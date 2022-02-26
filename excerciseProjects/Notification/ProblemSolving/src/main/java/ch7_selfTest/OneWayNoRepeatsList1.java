package ch7_selfTest;

public class OneWayNoRepeatsList1 {
    public static int START_POSITION = 1;
    public static int DEFAULT_SIZE = 50;
    //entry.length is the total number of items you have room
//for on the list (its capacity); countOfEntries is the number of
//items currently on the list.
    private int countOfEntries; //can be less than entry.length.
    private String[] entry;
    /**
     Creates an empty list with a given capacity.
     */
    public OneWayNoRepeatsList1(int maximumNumberOfEntries)
    {
        entry = new String[maximumNumberOfEntries];
        countOfEntries = 0;
    }
    /**
     Creates an empty list with a capacity of DEFAULT_SIZE.
     */
    public OneWayNoRepeatsList1()
    {
        entry = new String[DEFAULT_SIZE];
        countOfEntries = 0;
// or replace these two statements with this(DEFAULT_SIZE);
    }
    public boolean isFull()
    {
        return countOfEntries == entry.length;
    }
    public boolean isEmpty()
    {
        return countOfEntries == 0;
    }
    /**
     Precondition: List is not full.
     Postcondition: If item was not on the list,
     it has been added to the list.
     */
    public void addItem(String item)
    {
        if (!isOnList(item))
        {
            if (countOfEntries == entry.length)
            {
                System.out.println("Adding to a full list!");
                System.exit(0);
            }
            else
            {
                entry[countOfEntries] = item;
                countOfEntries++;
            }
        } //else do nothing. Item is already on the list.
    }
    /**
     If the argument indicates a position on the list,
     the entry at that specified position is returned;
     otherwise, null is returned.
     */
    public String getEntryAt(int position)
    {
        String result = null;
        if ((1 <= position) && (position <= countOfEntries))
            result = entry[position - 1];
        return result;
    }
    /**
     Returns true if position indicates the last item
     on the list; otherwise, returns false.
     */
    public boolean atLastEntry(int position)
    {
        return position == countOfEntries;
    }
    /**
     Returns true if item is on the list;
     otherwise, returns false. Does not differentiate
     between uppercase and lowercase letters.
     */
    public boolean isOnList(String item)
    {
        boolean found = false;
        int i = 0;
        while (!found && (i < countOfEntries))
        {
            if (item.equalsIgnoreCase(entry[i]))
                found = true;
            else
                i++;
        }
        return found;
    }
    public int getMaximumNumberOfEntries()
    {
        return entry.length;
    }
    public int getNumberOfEntries()
    {
        return countOfEntries;
    }
    public void eraseList()
    {
        countOfEntries = 0;
    }
}
