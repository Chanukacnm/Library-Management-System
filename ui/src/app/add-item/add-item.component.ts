import { Component, OnInit } from '@angular/core';

import {FormControl, FormGroup} from '@angular/forms';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-add-item',
  templateUrl: './add-item.component.html',
  styleUrls: ['./add-item.component.css']
})
export class AddItemComponent  {


  addBook: FormGroup;
  addDVD: FormGroup;
  addBk:any;
  addDVDs:any;
  constructor(private http: HttpClient) {
    this.addBook= new FormGroup({
      'bookCode': new FormControl(null),
      'bookName': new FormControl(null),
      'ISBN': new FormControl(null),
      'bookAuthor': new FormControl(null),
      'bookPublisher': new FormControl(null),
      'numberOfPages': new FormControl(null)

    })
    this.addDVD=new FormGroup({
      'dvdCode': new FormControl(null),
      'dvdName': new FormControl(null),
      'languages': new FormControl(null),
      'subtitles': new FormControl(null),
      'producer': new FormControl(null),
      'actor': new FormControl(null)

    })
  }


  aBook(){

    let add=JSON.stringify(this.addBook.value);
    return this.http.post('/api/onclick',add).subscribe((test: any)=>{
      console.log(test);
      alert("Book Added Succesfuly");

      this.addDVDs=test;
    });

  }


  aDvd(){

    let addD=JSON.stringify(this.addDVD.value);
    return this.http.post('/api/click',addD).subscribe((advd: any)=>{
      console.log(advd);
      alert("Dvd Added Succesfuly");
      this.addDVD=advd;
    });
  }

}
