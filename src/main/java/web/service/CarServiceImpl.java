package web.service;

import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarDAO carDAO = new CarDAOImpl();

    @Override
    public List<Car> show(Integer count) {
        return carDAO.show(count);
    }
}
