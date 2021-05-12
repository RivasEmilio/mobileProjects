//
//  ContentView.swift
//  LiveListProject
//
//  Created by Emilio Rivas on 5/6/21.
//

import SwiftUI

struct ContentView: View {
    
    var countryController = CountryContoller()
    
    var body: some View {
        NavigationView {
            List(countryController.countries){ country in
                Text(country.name)
            }
            .navigationBarTitle("Countries", displayMode: .inline)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
