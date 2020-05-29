import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-borrow-item',
  templateUrl: './borrow-item.component.html',
  styleUrls: ['./borrow-item.component.css']
})
export class BorrowItemComponent {

  brrBook:FormGroup;
  brrDVD:FormGroup;
  constructor(private http: HttpClient) {
    this.brrBook=new FormGroup({
      'brrBkCode': new FormControl(null),
      'brrDate': new FormControl(null),
      'bookName': new FormControl(null),
      'curReader': new FormControl(null),
      'bookCode': new FormControl(null)
    })
    this.brrDVD=new FormGroup({
      'brDvdCode': new FormControl(null),
      'dvdName': new FormControl(null),
      'currOwner': new FormControl(null),
      'brrDate': new FormControl(null),
      'dvdCode': new FormControl(null)

    })
  }
  borrowBook(){
    let brrBk=JSON.stringify(this.brrBook.value);
    return this.http.post('/api/brrBook',brrBk).subscribe((borrowbk: any)=>{
      console.log(borrowbk);
      alert("Book Borrowed Succesfuly");
    });
  }

  borrowDVD(){
    let brrDV=JSON.stringify(this.brrDVD.value);
    return this.http.post('/api/brrDVD',brrDV).subscribe((borrowdvds: any)=>{
      console.log(borrowdvds);
      alert("Book Borrowed Succesfuly");
    });
  }



}
