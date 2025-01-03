package FindMyTrain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {

    private Map<String, FindMyTrain.Station> stations=new HashMap<>();
    private Map<String, FindMyTrain.Train> trains=new HashMap<>();
    private List<FindMyTrain.Schedule> schedules = new ArrayList<>();

    public void addStations(FindMyTrain.Station station)
    {
        stations.put(station.getStationId(),station);
    }
    public void addTrain(FindMyTrain.Train train)
    {
        trains.put(train.getTrainID(), train);
    }

    public void addSchedule(FindMyTrain.Schedule schedule)
    {
        schedules.add(schedule);
    }

    public List<FindMyTrain.Schedule> findMyTrains(String startStationName, String endStationName)
    {
        List<FindMyTrain.Schedule> res=new ArrayList<>();
        for(FindMyTrain.Schedule schedule:schedules)
        {
            if(schedule.getStation().getStationName().equals(startStationName) ||
                    schedule.getStation().getStationName().equals(endStationName))
            {
                res.add(schedule);
            }
        }
        return res;
    }

}