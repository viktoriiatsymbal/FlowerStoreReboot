package ua.edu.ucu.apps.flowerstore.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlower() {
        return flowerRepository.findAll(); }
    
    public void add(Flower flower) {
        flowerRepository.save(flower);
    }
}
