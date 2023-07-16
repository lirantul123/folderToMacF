using System;

class LiranString
{
    int GetLength(){
        int sum;
        Console.WriteLine("Enter: ");
        int e = Console.nextInt();

        for (int i=1; i<=e.Length(); i++)
            sum+=i;

        return sum;

    }                                  

    void AddChar(char x){
        char ch = Console.next().charAt(0);
        x.AddChar(this.x);

        Console.WriteLine(x + " " + ch);
    }

    void AddString(LiranString x)
    {
        Console.WriteLine("Enter");
        string e = Console.ReadLine();
        x.AddString(this.x);

        Console.WriteLine(x + " " + e);
    }

    public static void Main(String[] args)
    {
        GetLength();
        AddChar();
        AddString();
    }
}