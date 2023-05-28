package mirea.artemtask.Services.Implementations;

import mirea.artemtask.Entities.Tour;
import mirea.artemtask.Services.TourService;
import mirea.artemtask.Repositories.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository tourRepository;
    @Override
    public void save(Tour tour) {
        tourRepository.save(tour);
    }
}
