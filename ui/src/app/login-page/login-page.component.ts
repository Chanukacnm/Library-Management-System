import { Component, OnInit } from '@angular/core';
import {Router}from'@angular/router';
import {from} from "rxjs";

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent {
  uName: any;
  pwd:any;

  constructor(public router:Router) { }


  logM(){
    console.log(this.uName);
    console.log(this.pwd);
    if(this.uName =="admin" && this.pwd =="admin"){
      alert("Invalid Username Or Password...")
    }else {

      this.router.navigateByUrl('home-page');
    }
  }

}
