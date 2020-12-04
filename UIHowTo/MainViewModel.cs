using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Text;

namespace UIHowTo
{
    public class MainViewModel : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;


        private ObservableCollection<Places> Places;

        public ObservableCollection<Places> places
        {
            get { return Places; }
            set { Places = value;

                PropertyChanged?.Invoke(this, new PropertyChangedEventArgs("places"));
            }
        }


        public MainViewModel()
        {
            places = new ObservableCollection<Places>();
            addData();
        }

        private void addData()
        {
            places.Add(new Places
            {

                id = 0,
                title = "The beautiful lake",
                country = "Norway",
                imgSource = "https://images.pexels.com/photos/2217365/pexels-photo-2217365.jpeg"
            });
            places.Add(new Places
            {

                id = 0,
                title = "Adventure of snow",
                country = "Nepal",
                imgSource = "https://images.pexels.com/photos/753772/pexels-photo-753772.jpeg"
            });
            places.Add(new Places
            {

                id = 0,
                title = "Beach is where life is",
                country = "Malaysia",
                imgSource = "https://images.pexels.com/photos/6023784/pexels-photo-6023784.jpeg"
            });
        }
    }
}
