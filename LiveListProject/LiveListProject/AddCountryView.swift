//
//  AddCountryView.swift
//  LiveListProject
//
//  Created by Emilio Rivas on 5/13/21.
//

import SwiftUI

struct AddCountryView: View {
    
    @EnvironmentObject var countryController: CountryContoller
    @Environment(\.presentationMode) var presentation
    
    @State var countryName: String = ""
    @State var population: String = ""
    var body: some View {
        ZStack{
            Color(red: 230/255, green: 230/255, blue: 230/255)
            VStack{
                
                Text("Please input a country and its population")
                    .font(.title3)
                    .fontWeight(.bold)
                    .multilineTextAlignment(.leading)
                    .padding(.bottom, 100)
                HStack{
                    Image(systemName: "pencil.circle")
                        .foregroundColor(.black)
                    TextField("Country", text: $countryName)
                }.padding()
                .overlay(RoundedRectangle(cornerRadius: 10).stroke(Color.black, lineWidth: 3.0))
                HStack{
                    Image(systemName: "person.3")
                        .foregroundColor(.black)
                    TextField("Population", text: $population)
                }
                .padding()
                .overlay(RoundedRectangle(cornerRadius: 10).stroke(Color.black, lineWidth: 3.0))
                HStack{
                    Button(action: {countryController.addCountry(newCountry: CountryModel(id: UUID(), name: countryName, population: population))
                        self.presentation.wrappedValue.dismiss()
                        
                    }) {
                        Text("ADD")
                            .fontWeight(.heavy)
                    }.padding().padding(.horizontal).foregroundColor(.white).background(Color.blue).cornerRadius(7.0)
                    Button(action: {self.presentation.wrappedValue.dismiss()}) {
                        Text("CANCEL")
                            .fontWeight(.heavy)
                    }.padding().padding(.horizontal).foregroundColor(.white).background(Color.red).cornerRadius(7.0)
                }
                .padding(.top, 30)
            }
            .padding(.horizontal, 20)
            .navigationBarTitle("Add Country", displayMode: .inline)
            
        }
        }
    
}

struct AddCountryView_Previews: PreviewProvider {
    
    static var previews: some View {
        AddCountryView()
    }
}
