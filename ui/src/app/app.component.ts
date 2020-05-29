import { Component } from '@angular/core';

import { AppService } from './app.service';
import {HttpClient} from "@angular/common/http";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // form: FormGroup;
  //
  // constructor(private http: HttpClient) {
  //   this.form = new FormGroup({
  //     'one': new FormControl(null),
  //     'two': new FormControl(null)
  //   });
  // }
  //
  // /**
  //  * This method is used to test the post request
  //  */
  // onAction() {
  //
  //   let variableName = JSON.stringify(this.form.value);
  //   return this.http.post('/api/onclick', variableName).subscribe((test: any) => {
  //       console.log(test);
  //   });
  // }
}
