import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-generate-report',
  templateUrl: './generate-report.component.html',
  styleUrls: ['./generate-report.component.css']
})
export class GenerateReportComponent{

  bookGenRep: FormGroup;
  genBK: any;
  dvdGenRep:FormGroup;
  genDVD:any;
  constructor(private  http:HttpClient) {
    this.bookGenRep= new FormGroup({
      'brrBkCode' : new FormControl(null),
    })
    this.dvdGenRep= new FormGroup({
      'brDvdCode' : new FormControl(null),
    })
  }

  bookGenReport(){

    let genRBk=JSON.stringify(this.bookGenRep.value);
    return this.http.post('/api/genBook',genRBk).subscribe((genbk: any)=>{
      console.log(genbk);
      alert("Generate Report is Successful");
      this.genBK=genbk;

    });
  }
  dvdGenReport(){
    let genRdvd=JSON.stringify(this.dvdGenRep.value);
    return this.http.post('/api/genDvd',genRdvd).subscribe((gendv: any)=>{
      console.log(gendv);
      alert("Generate Report is Successful");
      this.genDVD=gendv;

    });
  }

}
