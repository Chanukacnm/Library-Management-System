import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-delete-item',
  templateUrl: './delete-item.component.html',
  styleUrls: ['./delete-item.component.css']
})
export class DeleteItemComponent {

  delBook:FormGroup;
  delDvd:FormGroup;

  constructor(private http: HttpClient){
    this.delBook= new FormGroup({
      'bookCode':new FormControl(null)
    })
    this.delDvd=new FormGroup({
      'dvdCode':new FormControl(null)
    })

  }

  deletBook(){

    let delBk=JSON.stringify(this.delBook.value);
    return this.http.post('/api/dlt',delBk).subscribe((delbook: any)=>{
      console.log(delbook);
      alert("Book Deleted Succesfuly");
    });
  }

  deletDvd(){
    let deltDv=JSON.stringify(this.delDvd.value);
    return this.http.post('/api/dltDvd',deltDv).subscribe((deldvd: any)=>{
      console.log(deldvd);
      alert("DVD Deleted Succesfuly");
    });
  }


}
