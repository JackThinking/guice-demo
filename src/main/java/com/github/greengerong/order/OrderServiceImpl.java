package com.github.greengerong.order;

import com.github.greengerong.item.ItemService;
import com.github.greengerong.named.NamedService;
import com.github.greengerong.price.PriceService;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Set;

/**
 * ***************************************
 * *
 * Auth: green gerong                     *
 * Date: 2014                             *
 * blog: http://greengerong.github.io/    *
 * github: https://github.com/greengerong *
 * *
 * ****************************************
 */
public class OrderServiceImpl implements OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    private Set<ItemService> itemServices;

    private PriceService priceService;

    private List<NamedService> namedServices;

    public OrderServiceImpl() {
    }

    @Inject
    public OrderServiceImpl(@Named("kkv") Set<ItemService> itemServices, PriceService priceService, List<NamedService> namedServices) {
        this.itemServices = itemServices;
        this.priceService = priceService;
        this.namedServices = namedServices;
    }

    @Override
    public void add(Order order) {
        for (ItemService item : itemServices) {
            item.get(0);
        }
        priceService.getPrice();
    }

    @Override
    public void remove(Order order) {
    }

    @Override
    public Order get(int id) {
        for (ItemService item : itemServices) {
            item.get(id);
        }
        return new Order(id);
    }

    public Set<ItemService> getItemServices() {
        return itemServices;
    }

    public PriceService getPriceService() {
        return priceService;
    }

    public List<NamedService> getNamedServices() {
        return namedServices;
    }
}
