/*
 * MobileCustomer
 * 
 * This class represents a customer of a cell phone service company, focusing on the 
 * customer's data plan and usage.
 * 
 *  * NOTE: This is a copy of the CellCustomer class, renamed for the video on constructors.
 * 
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPDemo
{
    internal class MobileCustomer
    {

        // Fields (instance variables)
        private string name;
        private string phoneNumber;
        private double monthlyData;
        private double remainingData;

        // Constructor
        public MobileCustomer(String name, String phoneNumber, double monthlyData)
        {
            this.name = name; // name = name doesn't work!
            this.phoneNumber = phoneNumber;
            this.monthlyData = monthlyData;
            this.remainingData = monthlyData;
        }

        public MobileCustomer(String name, String phoneNumber)
        {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.monthlyData = 8.0;
            this.remainingData = 8.0;
        }

        // Getters
        public string GetName()
        {
            return this.name;
        }

        public string GetPhoneNumber()
        {
            return this.phoneNumber;
        }

        public double GetMonthlyData()
        {
            return this.monthlyData;
        }

        public double GetRemainingData()
        {
            return this.remainingData;
        }

        // Setters
        public void SetName(string cName)
        {
            this.name = cName;
        }

        public void SetPhoneNumber(string cPhoneNumber)
        {
            this.phoneNumber = cPhoneNumber;
        }

        public void SetMonthlyData(double cMonthlyData)
        {
            this.monthlyData = cMonthlyData;
            this.remainingData = cMonthlyData;
        }

        // Mutators

        public void UseData(double dataUsed)
        {
            this.remainingData -= dataUsed;
        }

        public void AddData(double amount)
        {
            this.remainingData += amount;
        }

        public void ResetData()
        {
            this.remainingData = this.monthlyData;
        }

    }
}
