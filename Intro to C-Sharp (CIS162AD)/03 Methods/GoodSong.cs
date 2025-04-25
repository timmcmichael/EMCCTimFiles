/*
 * 
 * This program outputs the lyrics of a good--but repetitive--song.
 * 
 * It demonstrates defining and calling a method.
 * 
 */

namespace GoodSong
{
    internal class GoodSong
    {
        static void Main(string[] args)
        {
            OutputTitle();
            Console.WriteLine("by The Kinks\n\n");
            OutputChorus();
            OutputChorus();
            OutputChorus();
        }

        public static void OutputChorus()
        {
            Console.WriteLine("Yeah, you really got my now\nYou got me so I don't know what I'm doin', now");
            Console.WriteLine("Oh yeah, you really got me now\nYou got me so I can't sleep at night");
            //Console.WriteLine("You really got me\nYou really got me");
            OutputTitle();
            OutputTitle();
        }

        public static void OutputTitle()
        {
            Console.WriteLine("You Really Got Me");
        }

    }
}
