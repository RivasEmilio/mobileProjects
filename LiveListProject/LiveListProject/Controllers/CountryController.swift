//
//  CountryController.swift
//  LiveListProject
//
//  Created by Emilio Rivas on 5/6/21.
//

import Foundation


class CountryContoller {
    
    var countries: [CountryModel]
    
    init() {
        self.countries = [
            CountryModel(id: UUID(), name: "Mexico", population: "127M"),
            CountryModel(id: UUID(), name: "Alemania", population: "83M"),
            CountryModel(id: UUID(), name: "Canada", population: "37M"),
            CountryModel(id: UUID(), name: "Italy", population: "68M"),
            CountryModel(id: UUID(), name: "China", population: "1388M"),
        ]
    }
}
