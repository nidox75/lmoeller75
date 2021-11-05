package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/auctions")
public class AuctionController {


    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @GetMapping(path = "")
    public List<Auction> list(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") Double currentBid_lte) {
        if (!title_like.equals("")) {
            return dao.searchByTitle(title_like);
        } else if (currentBid_lte > 0) {
            return dao.searchByPrice(currentBid_lte);
        } else {
            return dao.list();


        }

        @GetMapping(path = "/{auctionId}")
        public Auction get ( @PathVariable int auctionId){
            return dao.get(auctionId);
        }

        @PostMapping(path = "")
        public Auction create (@RequestBody Auction newAuction){
            return dao.create(newAuction);
        }

    }
