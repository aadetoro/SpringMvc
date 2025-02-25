package com.example.myappdemo.Controller;
import com.example.myappdemo.Model.Beer;
import com.example.myappdemo.Service.BeerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{id}")
    public String getBeerById(@PathVariable Long id) {
        return "Beer with ID: " + id;
    }

    @PostMapping
    public Beer createBeer(@RequestBody Beer beer) {
        return beerService.saveBeer(beer);
    }

    @PutMapping("/{id}")
    public Beer updateBeer(@PathVariable Long id, @RequestBody Beer beer) {
        return beerService.updateBeer(id, beer);
    }

    @DeleteMapping("/{id}")
    public void deleteBeer(@PathVariable Long id) {
        beerService.deleteBeer(id);
    }
}
