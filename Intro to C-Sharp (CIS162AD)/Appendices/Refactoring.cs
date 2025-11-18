static double CalculateBookingFee(string actType, int att)
{
    double f = 0;

    if (actType == "DJ")
    {
        if (att > 200)
        {
            f = att * 0.20;
        }
        else
        {
            if (att > 100)
            {
                f = att * 0.25;
            }
            else
            {
                f = att * 0.30;
            }
        }
    }
    else
    {
        if (actType == "Band")
        {
            if (att > 200)
            {
                f = att * 0.15;
            }
            else
            {
                if (att > 100)
                {
                    f = att * 0.20;
                }
                else
                {
                    f = att * 0.28;
                }
            }
        }
        else
        {
            if (actType == "OpenMic")
            {
                if (att > 150)
                {
                    f = att * 0.10;
                }
                else
                {
                    if (att > 50)
                    {
                        f = att * 0.12;
                    }
                    else
                    {
                        f = att * 0.15;
                    }
                }
            }
            else
            {
                f = att * 0.50; // mystery acts are expensive!
            }
        }
    }

    return f;
}
