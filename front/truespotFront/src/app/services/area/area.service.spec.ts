import {TestBed} from '@angular/core/testing';

import {AreaService} from './area.service';

describe('AreaServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AreaService = TestBed.get(AreaService);
    expect(service).toBeTruthy();
  });
});
