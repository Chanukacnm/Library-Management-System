import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-display-items',
  templateUrl: './display-items.component.html',
  styleUrls: ['./display-items.component.css']
})
export class DisplayItemsComponent {
  displyBookForm: FormGroup;
  diskBk: any;
  displyDVDForm:FormGroup;
  diskDVD:any;

  constructor(private  http:HttpClient) {
    this.displyBookForm= new FormGroup({
      'bookCode' : new FormControl(null),
    })
    this.displyDVDForm= new FormGroup({
      'dvdCode' : new FormControl(null),
    })
  }

  displyBook(){

    let disBk=JSON.stringify(this.displyBookForm.value);
    return this.http.post('/api/dis',disBk).subscribe((disbook: any)=>{
      console.log(disbook);
    this.diskBk=disbook;
    });
  }
  displDVD(){
    let dispdvd=JSON.stringify(this.displyDVDForm.value);
    return this.http.post('/api/disdvd',dispdvd).subscribe((disdvds: any)=>{
      console.log(disdvds);
      this.diskDVD=disdvds;
    });
  }

}
